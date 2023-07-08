package org.example;

public class Assignment8 {
    public static void main(String[] args) {
        try {
            new TestException().canThrowException(2);
        } catch (MyException1 e1) {
            System.out.println("Caught: " + e1.getMessage());
        } catch (MyException2 e2) {
            System.out.println("Caught: " + e2.getMessage());
        } catch (MyException3 e3) {
            System.out.println("Caught: " + e3.getMessage());
        } finally {
            System.out.println("Finally I will be printed");
        }


    }

    private static class MyException1 extends Exception {
        public MyException1(String message) {
            super(message);
        }
    }

    private static class MyException2 extends Exception {
        public MyException2(String message) {
            super(message);
        }
    }

    private static class MyException3 extends Exception {
        public MyException3(String message) {
            super(message);
        }
    }

    private static class TestException {

        public void canThrowException(int exceptionNumber) throws MyException1, MyException2, MyException3 {
            if (exceptionNumber == 1) {
                throw new MyException1("I am the exception 1");
            }
            else if (exceptionNumber == 2) {
                throw new MyException2("I am the exception 2");
            }
            else {
                throw new MyException3("I am the exception 3");
            }
        }
    }
}
