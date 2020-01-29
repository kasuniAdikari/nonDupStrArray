/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nondupstrarrayapp;

/**
 *
 * @author 174004m
 */
public class Nondupstrarrayapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NonDupStrArray x=new NonDupStrArray(10);
       x.insert(11);
       x.
        
    }
    
}

class NonDupStrArray{

private String[]str;
private int nElems;

public NonDupStrArray(int max){

  this.str= new String[max];
  this.nElems=0;
    

}
//public int size(){

//}
public boolean find(String searchKey){

for(int i=0;i<this.nElems;i++){
if(this.str[i]==searchKey){
return true;
}
}
return false;
}





public void insert(String value){
for(int i=0;i<this.nElems;i++){
if(this.str.length==this.nElems)
    System.out.println("Array is full");
return;
    
}
if(find(value)){
System.out.println("value exists");
return;
}
else{
   
this.str[this.nElems]=value;
this.nElems++;
     
System.out.println("value is inserted");

    

}

}

public boolean delete(String name){
for(int i=0;i<this.nElems;i++){
if(this.str[i]==name){
for(int j=0;j<nElems-1;j++){
this.str[j]=this.str[j]+1;
}
nElems--;
System.out.println("value deleted");
return true;
}
}
System.out.println("value not found");
return false;

}

public void display(){
for(int i=0;i<this.nElems;i++){
System.out.print(str[i]+"");
}
System.out.println();
}


}
