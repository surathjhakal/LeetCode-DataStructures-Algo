    public static class Item{
        int value,weight;
        Item(int value,int weight){
            this.value=value;
            this.weight=weight;
        }
    }

    public static int knapSack(Item[] arr,int w){
        Arrays.sort(arr, new Comparator<Item>() {
            @Override
            public int compare(Item a,Item b){
                double r1 = (double)(a.value) / (double)(a.weight);
                double r2 = (double)(b.value) / (double)(b.weight);
                return Double.compare(r2, r1);
            }
        });
        for(Item obj:arr){
            System.out.println(obj.value+"-"+obj.weight);
        }

        int curWeight = 0;
        double finalvalue = 0.0;
        for (Item item : arr) {

            if (curWeight + item.weight <= w) {
                curWeight += item.weight;
                finalvalue += item.value;
            } else {
                int remain = w - curWeight;
                finalvalue += ((double) item.value / (double) item.weight) * (double) remain;
                break;
            }
        }

        return (int)finalvalue;
    }
