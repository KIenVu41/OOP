/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form9;

/**
 *
 * @author Admin
 */
public class Form9{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    // class Number
   
        protected   int value;
        protected   int minvl;
        protected   int maxvl;

        public Form9() {
        }

        public Form9(int value, int minvl, int maxvl) {
            this.value = value;
            this.minvl = minvl;
            this.maxvl = maxvl;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setMinvl(int minvl) {
            this.minvl = minvl;
        }

        public void setMaxvl(int maxvl) {
            this.maxvl = maxvl;
        }

        public int getValue() {
            return value;
        }

        public int getMinvl() {
            return minvl;
        }

        public int getMaxvl() {
            return maxvl;
        }

        @Override
        public String toString() {
            return "Number{" + "value=" + value + ", minvl=" + minvl + ", maxvl=" + maxvl + '}';
        }

        
        
        // so nguyen to
        public boolean isPrime(){
            int count = 0;
            if(this.value < 1){
                return false;
            }
            for(int i = 2; i < Math.sqrt(this.value); i++){
                    if(this.value % i == 0){
                        count++;
                    }
             }
            if(count == 0){
                return true;
            }else{
                return false;
            }
            
        }
    }

