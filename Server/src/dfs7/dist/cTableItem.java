package dfs7.dist;

public class cTableItem {
    private int m_id;
    private String m_ip;

    public cTableItem(int new_id, String new_ip) {
        m_id = new_id;
        m_ip = new_ip;
    }

    public int getID() {
        return m_id;
    }
    public void setID(int new_id) {
        m_id = new_id;
    }

    public String getIP() {
        return m_ip;
    }
    public void setIP(String new_ip) {
        m_ip = new_ip;
    }
}
