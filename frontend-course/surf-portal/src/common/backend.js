import axios from "axios";

export default class ServiceAPI {

    executePost(URL, data){
    return axios.post(URL, data);
    }

    executeGet(URL, id){
        return axios.get(URL + id);
    }

}