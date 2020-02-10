/*
        int[] a = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        int firstDuplicate(int[] a) {

            int u = a.length;

            int dublicate = 1;
            int first = u-1;

            if (u==1){
                return -1;
            } else{

                for  (int i=0; i < u ; i++){

                    for (int k = i+1 ; k < u ; k++) {

                        if (a[i] == a[k]){

                            dublicate = k;
                            if (dublicate<first){
                                first = dublicate;
                            }
                        }

                    }

                }

                if( first == u-1 ){
                    if(a[first] == a[u-2]){
                        return a[first];
                    }else{
                        return -1;
                    }
                }else {
                    return a[first];
                }
            }
        }


    }
}


 */

///////////// second way but slow
 /*

    int firstDuplicate(int[] a) {

        int dub = -1;
        int dubindex = a.length;

        for  (int i=0; i < a.length ; i++){

            int num = a[i];

            for (int j = i+1 ; j < a.length ; j++) {
                int otherNum = a[j];

                if (num == otherNum && j < dubindex){
                    //found dub
                    dub = num;
                    dubindex = j ;
                }

            }

        }

        return dub;
    }



//////////javastricp yontemi
function firstDuplicate(a) {
        const indices = {};

        for(let i = 0 ; i < a.length ; i++){
        const num = a[i];
        if(Number.isInteger(indices[num]) && indices[num] !== i) return num;
        indices[num] = i;
        }

        return -1;
        }

   */
