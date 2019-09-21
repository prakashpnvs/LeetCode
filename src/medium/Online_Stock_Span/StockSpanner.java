package medium.Online_Stock_Span;

import java.util.Stack;

class StockSpanner {

    Stack<Counter> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        while(!stack.isEmpty() && stack.peek().price <= price) {
            span = span + stack.pop().count;
        }

        Counter counter = new Counter(price, span);
        stack.push(counter);

        return span;
    }

    class Counter {
        int price;
        int count;

        public Counter(int price, int count) {
            this.price = price;
            this.count = count;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
