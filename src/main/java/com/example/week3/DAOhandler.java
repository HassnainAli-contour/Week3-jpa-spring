//package com.example.week3;
//
//import com.example.week3.Entities.Match;
//import com.example.week3.Entities.Player;
//import com.example.week3.Entities.Team;
//import com.example.week3.Entities.Tournament;
//import com.example.week3.repository.GenericDAOImpl;
//
//public class DAOhandler {
//    private static GenericDAOImpl manageTeam;
//    private static GenericDAOImpl managePlayer;
//    private static GenericDAOImpl manageMatch;
//    private static GenericDAOImpl manageTournament;
//
//    public static void createData(){
////        manageTeam = new GenericDAOImpl();
////        managePlayer = new GenericDAOImpl();
////        manageMatch = new GenericDAOImpl();
////        manageTournament = new GenericDAOImpl();
//
//
//        Player p=new Player(223,"Saeed Anwer",23);
//        Player p2=new Player(247,"Shahid Afridi",24);
//        Player p3=new Player(256,"Abdul Qadir",22);
//        Player p4=new Player(300,"Babar Azam",23);
//        Player p5=new Player(222,"Imran Nazeer",25);
//        Player p6=new Player(123,"Imran",25);
//
//        //Adding players..............
//        managePlayer.add(p);
//        managePlayer.add(p2);
//        managePlayer.add(p3);
//        managePlayer.add(p4);
//        managePlayer.add(p5);
//        managePlayer.add(p6);
//
//        //deleting players....................................................
//        managePlayer.delete(123);
//        //System.out.println(managePlayer.get(123));
//        //Updating players....................................................
//        p2.setAge(40);
//        managePlayer.update(p2);
//        //managePlayer.printAll();
//
//        //getting player.........................................................
//        //System.out.println(managePlayer.get(256).getName());
//
//
//        Team t=new Team(1,"Pakistan");
//        t.setTeamPlayers(new Player[]{p,p2,p3});
//        Team t1=new Team(2,"India");
//        t1.setTeamPlayers(new Player[]{p4,p3,p5});
//        Team t2=new Team(3,"Srilanka");
//        t2.setTeamPlayers(new Player[]{p4,p5,p});
//
//
//        manageTeam.add(t);
//        manageTeam.add(t1);
//        manageTeam.add(t2);
//
//        //getting team.................................................
//        //System.out.println("Team :"+ manageTeam.get(1).getName());
//
//        //printing players..............................................
//        //manageTeam.teamPlayers(2);
//
////		System.out.println("Printing team players................");
////		((Team)manageTeam.get(1)).getPlayers().forEach(player-> {
////			Player a =(Player)player;
////			System.out.printf("Name : %-20s  age:%4d Runs : %4d \n",a.getName(),a.getage(),a.getRuns());
////		});
//
//        Match m = new Match(1,"Quarter Final");
//        m.seTeams(t1,t2);
//        m.setScoreCard(new Player[]{p4,p5,p},null);
//        Match m1 = new Match(2,"Semi Final");
//        m1.setScoreCard(new Player[]{p,p2,p3},null);
//        m1.seTeams(t,t2);
//        Match m2 = new Match(3,"Final");
//        m2.setScoreCard(new Player[]{p4,p3,p5},null);
//        m2.seTeams(t,t1);
//
//
//        manageMatch.add(m);
//        manageMatch.add(m1);
//        manageMatch.add(m2);
//
//        m2.setName("Finalsssss");
//        manageMatch.update(m2);
//
//        //print scorecard................................................................
//        //manageMatch.printScoreCard(3);
//        Match gm= (Match) manageMatch.get(3);
////		System.out.println("Match name  :  "+gm.getName()+"....................................");
////		gm.getScoreCard().forEach((key,val) ->
////				System.out.printf("Name: %-10s Runs:%-4d Wickets:%-4d \n",key.getName(),val.getRuns(),val.getWickets())
////		);
//
//        //...........................................................................................
//        Tournament to = new Tournament(1,"Asia Cup");
//        to.setMatches(new Match[]{m1,m2,m});
//        manageTournament.add(to);
//    }
//    public static GenericDAOImpl getManagePlayer(){
//        return managePlayer;
//    }
//}
