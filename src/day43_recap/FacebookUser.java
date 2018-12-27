package day43_recap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import day43_recap.Post;

public class FacebookUser {

	String username;
	int age;
	String name;
	String password;
	List<FacebookUser> friendsList = new ArrayList<>();
	List<FacebookUser> friendsRequestList = new ArrayList<>();
	List<Post> posts = new ArrayList<>();

	public void userInfo() {

		System.out.println("Name: " + name + '\n' + "Username: " + username + '\n' + "Age: " + age + '\n' + "Friends: "
				+ friendsList.size() + '\n' + "Posts: " + posts.size());

	}

	public boolean sendFriendRequest(FacebookUser futureFriend) {

		if (futureFriend.friendsList.size() >= 5000) {
			System.out.println(futureFriend + " can't accept friend requests");
			return false;

		} else {
			System.out.println("Friend request sent to " + futureFriend.name);
			futureFriend.friendsRequestList.add(this);
			return true;
		}
	}

	public void seeFriends() {
		for (FacebookUser idx : friendsList) {
			idx.userInfo();
			System.out.println("-------------------------");

		}
	}

	public void acceptRequests() {
		int count = 1;
		Random random = new Random();
		for (int i = 0; i < friendsRequestList.size(); i++) {
			System.out.println("-----------------------------------------------");
			System.out.println("friend request number " + count);
			friendsRequestList.get(i).userInfo();
			count++;

			System.out.println("Do you want to accept " + friendsRequestList.get(i).name + " yes/no ?");
			String response = "";
			int responseToo = random.nextInt(10);
			if (responseToo % 2 == 0) {
				response = "yes";
			} else {
				response = "no";
			}
			if (response.equals("yes")) {
				System.out.println(friendsRequestList.get(i).name + " was added to your friends list.");
				friendsList.add(friendsRequestList.get(i));
				friendsRequestList.remove(i--);

			} else if (response.equals("no")) {
				System.out.println("You rejected " + friendsRequestList.get(i).name + " friend request.");
				friendsRequestList.remove(i--);
			} else {
				System.out.println("Invalid answer, it should be yes or no!!!");
			}

		}
	}

	public void post(Post example) {
		this.posts.add(example);
	}

	public FacebookUser(String username, String password) {
		this.username = username;
		this.password = password;

	}

	public FacebookUser(String name, String username, String password) {
		this.name = name;
		this.username = username;
		if (!password.contains(username)) {
			this.password = password;
		} else {
			System.out.println("Password can't contain the username.Please change password");
			this.password = "";
		}

	}

	public static void deleteAccount(FacebookUser user) {
		user = null;

	}

}
