package com.example.demo.bean;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_comment.id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_comment.comment_time
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private Long commentTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_comment.status
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_comment.user_id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_comment.article_id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private Long articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_comment.parent_id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_comment.content
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.id
     *
     * @return the value of cms_comment.id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.id
     *
     * @param id the value for cms_comment.id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.comment_time
     *
     * @return the value of cms_comment.comment_time
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public Long getCommentTime() {
        return commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.comment_time
     *
     * @param commentTime the value for cms_comment.comment_time
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setCommentTime(Long commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.status
     *
     * @return the value of cms_comment.status
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.status
     *
     * @param status the value for cms_comment.status
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.user_id
     *
     * @return the value of cms_comment.user_id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.user_id
     *
     * @param userId the value for cms_comment.user_id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.article_id
     *
     * @return the value of cms_comment.article_id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.article_id
     *
     * @param articleId the value for cms_comment.article_id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.parent_id
     *
     * @return the value of cms_comment.parent_id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.parent_id
     *
     * @param parentId the value for cms_comment.parent_id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.content
     *
     * @return the value of cms_comment.content
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.content
     *
     * @param content the value for cms_comment.content
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}