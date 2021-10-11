package domain;

public class Post {
<<<<<<< HEAD
    private String dateTime;
    private int id;
    private String groupName;
    private int groupId;
    private boolean isSigned;
    private String body;
    private String urlImage;
    private boolean isLiked;
    private int likeCounter;
    private boolean isReposted;
    private int repostCounter;
    private int looksCounter;

    // + getters/setters*
}
=======
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String postType;
    private int signerId;
    private boolean canPin;
    private boolean canEdit;
    private boolean canDelete;
    private boolean isPinned;
    private boolean markAsAds;
    private boolean isFavorite;
    private int postponedId;

    private Comment comment;
    private Like like;
    private Repost repost;
    private Viev viev;
    private Time time;

    public int getId() {
        return id;
    }
    // + getters/setters*
}
>>>>>>> f842daa (Initial commit)
