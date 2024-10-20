import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-upload-excel-file',
  templateUrl: './upload-excel-file.component.html',
  styleUrls: ['./upload-excel-file.component.css']
})
export class UploadExcelFileComponent implements OnInit {

  fileUploadURl = "http://localhost:8080/product/upload";

  file: File | null = null;

  flag = true;

  constructor(private http: HttpClient) { }

  ngOnInit(): void { }

  selectFile(event: any): void {
    this.file = event.target.files[0] || null;
    console.log(this.file);
  }

  uploadFile(): void {
    if (this.file) {
      let formData = new FormData();
      formData.append('file', this.file); 
      
      this.flag = false;
      this.http.post(this.fileUploadURl, formData).subscribe(
        (data:any) => {
          console.log(data);
          this.flag=true;
          alert(data.message)
        },
        (error:any) => {
          console.log(error);
          this.flag=true;
          alert("Error.....")
        }
      );  
    }
  }

}
