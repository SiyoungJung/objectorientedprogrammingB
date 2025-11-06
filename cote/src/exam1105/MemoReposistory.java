package exam1105;

public interface MemoReposistory {
    void addMemo(String id, String body);
    void getMemo();
    void deleteMemo(String id);
    void updateMemo(String id, String body);
}
