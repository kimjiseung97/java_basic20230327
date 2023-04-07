package day10.freinds;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class People {

    private String nickName; //닉네임

    //팔로워 목록
    private List<People> followers;

    //팔로잉 목록
    private List<People> followings;

    //팔로워 대기목록
    private List<People> follwerWaitList;


    //생성자


    public People(String nickName) {
        this.nickName = nickName;
        this.followers = new ArrayList<>();
        this.followings = new ArrayList<>();
        this.follwerWaitList = new ArrayList<>();
    }

    //팔로워 대기목록에 팔로우 요청한 사람을 추가하는 기능
    public void addFollowerWaitList(People requestPerson){
        this.follwerWaitList.add(requestPerson);
    }
    //팔로워 목록에 수락한 사람들을 추가하는 기능
    public void addFollower(People requestPerson){
        this.followers.add(requestPerson);
        this.follwerWaitList.remove(requestPerson);
    }

    //팔로워 대기목록에서 닉네임들을 보여주는 기능
    public List<String> showFollowerWaitPerson(){
        //팔로워 대기목록 사람들 닉네임만 저장할 리스트
        List<String> waitListName = new ArrayList<>();
        for (People people:follwerWaitList) {
            waitListName.add(people.nickName);
        }
        return waitListName;
    }


    //팔로워 목록에서 닉네임들을 보여주는 기능
    public List<String> showFollower() {
        // 팔로워대기목록 사람들 닉네임만 저장할 리스트
        List<String> waitListNames = new ArrayList<>();
        for (People people : followers) {
            waitListNames.add(people.nickName);
        }
        return waitListNames;
    }


    //팔로우 하기 기능
    public List<String> followPeople(People target){
        List<String> followList = new ArrayList<>();
        if (!this.followings.contains(target)) {
            this.followings.add(target);

            for (People p : followings) {
                followList.add(p.nickName);
            }
        }
        return followList;
    }

    //언팔로우 기능
    public List<String> unfollowPeople(People target){

        List<String> unfollowList = new ArrayList<>();
        if (this.followings.contains(target)) {
            this.followings.remove(target);

            for (People p : followings) {
                unfollowList.add(p.nickName);
            }
        }
        return unfollowList;
    }




    public List<People> getFollowers() {
        return followers;
    }

    public void setFollowers(List<People> followers) {
        this.followers = followers;
    }

    public List<People> getFollowings() {
        return followings;
    }

    public void setFollowings(List<People> followings) {
        this.followings = followings;
    }

    public List<People> getFollwerWaitList() {
        return follwerWaitList;
    }

    public void setFollwerWaitList(List<People> follwerWaitList) {
        this.follwerWaitList = follwerWaitList;
    }
}
