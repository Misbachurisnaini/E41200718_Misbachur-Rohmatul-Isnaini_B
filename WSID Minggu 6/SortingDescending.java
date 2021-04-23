public class SortingDescending {
public static void main(String[] args){
int []Data={29,13,10,7,34,21,4,54,30};
int i,j,a;
System.out.println("PROGRAM PENGURUTAN SECARA DESCENDING");
System.out.println("===================================\n");
System.out.println("Data sebelum diurutkan : ");
for(i=0;i<Data.length;i++)
System.out.print(Data[i]+" ");
System.out.println("\n");
for (i=0;i<Data.length-1;i++){
for (j=i+1;j<Data.length;j++){
if(Data[i]<Data[j]){
a=Data[i];
Data[i]=Data[j];
Data[j]=a;
}
}
}
System.out.println("Setelah data diurutkan : ");
for(i=0;i<Data.length;i++)
System.out.print(Data[i]+" "); 
System.out.println();
}
}