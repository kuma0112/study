package ch15.sec02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<>();

        // 추가
        boardList.add(new Board("제목1", "내용1", "홍길동"));
        boardList.add(new Board("제목2", "내용2", "이길동"));
        boardList.add(new Board("제목2", "내용3", "삼길동"));
        boardList.add(new Board("제목4", "내용4", "사길동"));
        boardList.add(new Board("제목5", "내용5", "오길동"));

        System.out.println(boardList);
        /*
        toString을 오버라이딩 안 하면
        [ch15.sec02.Board@251a69d7, ch15.sec02.Board@7344699f, ch15.sec02.Board@6b95977, ch15.sec02.Board@7e9e5f8a, ch15.sec02.Board@8bcc55f]

         toString을 오버라이딩 하면
         [Board{subject='제목1', content='내용1', writer='홍길동'}, Board{subject='제목2', content='내용2', writer='이길동'}, Board{subject='제목3', content='내용3', writer='삼길동'}, Board{subject='제목4', content='내용4', writer='사길동'}, Board{subject='제목5', content='내용5', writer='오길동'}]
         */
        System.out.println(boardList.size());
        System.out.println(boardList.get(2));

        for (int i = 0; i < boardList.size(); i++ ){
            System.out.println(boardList.get(i));
        }

        for (Board board : boardList) {
            System.out.println(board);
        }

        Iterator<Board> itr = boardList.listIterator();
        while(itr.hasNext()) {
            Board board = itr.next();
            System.out.println(board);
        }

//        boardList.remove(2);
//        System.out.println(boardList);

//        for (int i = 0; i < boardList.size(); i++ ){
//            Board board = boardList.get(i);
//            if (board.getSubject().equals("제목2")){
//                boardList.remove(i);
//            }
//        }
//        System.out.println(boardList);
        /*
        [Board{subject='제목1', content='내용1', writer='홍길동'}, Board{subject='제목2', content='내용3', writer='삼길동'}, Board{subject='제목4', content='내용4', writer='사길동'}, Board{subject='제목5', content='내용5', writer='오길동'}]
        제목2가 남아 있는 이유는, 앞에 있는 제목2를 삭제하면서 arraylist는 하나씩 당겨진다. 하지만 for문은 i++하면서 돌기 때문에 순회에서 잡히지 않은 것.
        따라서 순회 중 삭제는 문제가 발생할 수 있다.
         */
//
//        for (int i = boardList.size()-1; i >=0; i--) {
//            Board board = boardList.get(i);
//            if (board.getSubject().equals("제목2")) {
//                boardList.remove(i);
//            }
//        }
        // 이렇게 뒤에서부터 삭제하도록!

        Iterator<Board> itr2 = boardList.listIterator();
        while(itr2.hasNext()) {
            Board board = itr2.next();
            if (board.getSubject().equals("제목2")) {
                itr2.remove();
            }
        }
        System.out.println(boardList);
        /*
        [Board{subject='제목1', content='내용1', writer='홍길동'}, Board{subject='제목4', content='내용4', writer='사길동'}, Board{subject='제목5', content='내용5', writer='오길동'}]
        제목2가 잘 삭제된 것을 볼 수 있다.
         */
    }
}
