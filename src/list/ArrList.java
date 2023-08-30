package list;

//제네릭 타입 클래스
public class ArrList<E> {
  //인스턴스 변수
  public E a[]; //private E[] a; 라고 해도 됨
  public int size;

  //생성자
  public ArrList() {
    E[] a = (E[])new Object[1];
    size = 0;
  }

  //연산메서드
  public int size() {
    return size;
  }

  public E get(int k) {
    if (size==0)
      throw new IndexOutOfBoundsException();
    return a[k];
  }

  public boolean add(E e) {
    if (a.length == size) {
//      throw new ArrayIndexOutOfBoundsException();
      resize(a.length * 2);
    }
    a[size++] = e;
    return true;
  }

  public E resize() {
    E tobeDeleted = a[size - 1];
    a[size - 1] = null;
    size--;
    if ()
    return tobeDeleted;
  }

}
