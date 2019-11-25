class NoDupArray{
    private final long[] a; //ref to array a
    private int nElems; //number of data items
    private long temp;
 
    public NoDupArray (int max){
        this.a = new long[max];
        this.nElems = 0;
    }
    
    public boolean find (long searchKey){
        for(int i=0; i<this.nElems ; i++){
            if(a[i]==searchKey){
                return true;
            }
        }
        return false;
    } 
    
    public void insert (long value){//put element into array
        if(this.nElems == this.a.length){
            System.out.println("Array is full");
        }
        else if(!this.find(value)){
            this.a[this.nElems] = value;
            this.nElems++;
            System.out.println("Value inserted");
        }
        else{
            System.out.println("Value already exists");
        }
    } 
    
    public boolean delete (long value){
        for(int i=0; i<this.nElems ; i++){
            //if value found in index i
            if(this.a[i] == value){
                //take the after index of i 
                for(int j=i ; j<this.nElems ; j++){
                    this.a[j] = this.a[j+1];
                }
                this.nElems--;
                System.out.println("Value deleted");
                return true;
            }
        }
        System.out.println("Value not found");
        return false;
    }
    
    public void display (){
        for(int i=0;i<nElems;i++){
            for(int j=i;j<nElems;j++){
                if(this.a[j]<a[i]){
                    this.temp = this.a[j];
                    this.a[j]=this.a[i];
                    this.a[i]=this.temp;
                }
            }
        }
        for(int i=0; i<nElems ; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    } 
    
} 

public class Data_Str_lab_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NoDupArray x;
        x = new NoDupArray(10);
        x.insert(99);
        x.insert(55);
        x.insert(55);
        x.insert(555);
        x.display();
        x.insert(994);
        x.delete(55);
        x.display();
        x.delete(55555);
    }
    
}
