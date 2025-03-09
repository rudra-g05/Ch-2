class Echo{

    int count = 0;
    void hey(){
        System.out.print("hello bro..  ");
    }
}
class EchoTestDrive{
    public static void main (String[] args){

        Echo e1 = new Echo();
        int x= 0;
        while(x<6){
            e1.hey();
            e1.count = e1.count + 1;

            if(x ==3){
                e1.count = e1.count * 3;
            }
            if(x> 3){
                e1.count = e1.count + 2;
            }
            System.out.println(e1.count);
            x += 1;
        }
    }
}