import { Component, OnInit } from '@angular/core';
import { SortService } from '../sort.service';

@Component({
  selector: 'app-sort-number',
  templateUrl: './sort-number.component.html',
  styleUrls: ['./sort-number.component.css']
})
export class SortNumberComponent implements OnInit {

  answer = '';
  answerDisplay = '';
  showSpinner = false;
  randomNumbers: any = '';
  sortednumbers: any = '';
  historyInfo: any = '';
  positionchanged: any= {};

  constructor(private service: SortService) {

  }

  ngOnInit() {
  }

  getNumbers(): void {
    this.showSpinner = true;
    this.sortednumbers = '';
    this.positionchanged = '';
    this.historyInfo = '';
          this.service.getRandomNumbers().
          subscribe(response => {
            console.log('print numbers');
            console.log(response);
              this.randomNumbers = response;
              console.log(this.randomNumbers);


          });
    setTimeout(() => {
      // this.answerDisplay = this.answer;
      this.showSpinner = false;
    }, 200);

   // console.log(this.service.getRandomNumbers());
  }

  sortNumbers(): void {
    this.service.sortnumbers(this.randomNumbers).
    subscribe(response => {
      console.log('print numbers');
      console.log(response);
        this.sortednumbers = response.orderedlist;
        this.positionchanged = response.positionchanged;
    });
  }


  getHistory(): void {
          this.service.getHistoryInfo().
          subscribe(response => {
            console.log('print numbers');
            console.log(response);
              this.historyInfo = response;
              console.log(this.historyInfo);

          });
    setTimeout(() => {
      this.showSpinner = false;
    }, 200);
  }

  showAnswer() {
    this.showSpinner = true;

    setTimeout(() => {
      this.answerDisplay = this.answer;
      this.showSpinner = false;
    }, 2000);
  }

}
