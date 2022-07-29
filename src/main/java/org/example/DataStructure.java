package org.example;

public interface DataStructure {
    // 리스트의 가장 끝에 항목을 추가
    boolean add(String element);

    // 리스트의 index에 해당하는 부분에 항목을 추가
    void add(int index, String element);

    // 리스트의 가장 처음에 항목을 추가
    void addFirst(String element);

    // 리스트의 가장 끝에 항목을 추가
    void addLast(String element);

    //리스트의 가장 끝에서 항목을 추출 및 제거
    String remove();

    //리스트에서 해당 항목을 찾아 제거
    boolean remove(String element);

    // 리스트의 가장 처음 항목을 추출 및 제거
    String removeFirst();

    //리스트의 가장 끝 항목을 추출 및 제거
    String removeLast();

    //현재 리스트의 사이즈를 반환
    int size();

    //리스트의 index에 해당하는 항목을 추출하며, 제거는 하지 않음
    String get(int index);

    // 현재 리스트를 빈 리스트로 초기화
    void clear();
}
