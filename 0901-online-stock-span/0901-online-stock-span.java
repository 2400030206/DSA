class StockSpanner {

    int[] prices;
    Stack<Integer> indexStack;
    int i;

    public StockSpanner() {
        prices = new int[10000];
        indexStack = new Stack<>();
        i = 0;
    }

    public int next(int price) {
        prices[i] = price;
        while (!indexStack.isEmpty()
                && prices[indexStack.peek()] <= prices[i]) {

            indexStack.pop();
        }

        int span;

        if (indexStack.isEmpty()) {
            span = i + 1;
        } else {
            span = i - indexStack.peek();
        }
        indexStack.push(i);

        i++;

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */