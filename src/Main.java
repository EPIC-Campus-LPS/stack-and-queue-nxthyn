public class Main {
    public static void main(String[] args) {

        //zeroTestStack();
        //oneTestStack();
        //normalTestStack();

        //zeroTestQueue();
        //oneTestQueue();

    }

    public static void zeroTestStack() {

        Stack s = new Stack(new int[0]);
        s.push(1);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());


    }

    public static void oneTestStack() {

        Stack s = new Stack(new int[]{1});
        s.push(2);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());

    }

    public static void normalTestStack() {

        Stack s = new Stack(new int[]{1,2,3,4,5});
        s.push(0);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());

    }

    public static void zeroTestQueue() {

        Queue q = new Queue(new int[0]);
        q.add(1);
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());

    }

    public static void oneTestQueue() {

        Queue q = new Queue(new int[]{1});
        q.add(2);
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());


    }

    public static void normalTestQueue() {

        Queue q = new Queue(new int[]{1,2,3,4,5});
        q.add(6);
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());

    }

}