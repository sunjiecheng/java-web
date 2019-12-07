package service;

import bean.PropertyValue;
import dao.PropertyValueDAO;

public class PropertyValueService {
    private PropertyValueDAO dao = new PropertyValueDAO();
    public void add(PropertyValue bean) {
        dao.add(bean);
    }
    public void update(PropertyValue bean) {
        dao.update(bean);
    }
    public void delete(int id) {
        dao.delete(id);
    }
    public PropertyValue get(int id){
        return dao.get(id);
    }
    public PropertyValue get(int ptid,int pid){
        return dao.get(ptid,pid);
    }
}
