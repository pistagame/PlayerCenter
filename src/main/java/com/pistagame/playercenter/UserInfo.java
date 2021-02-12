package com.pistagame.playercenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "userCenter", indexStoreType="users", replicas = 0, shards = 5)
public class UserInfo implements Serializable {
    @Id
    private long  id; //用户id
    @Field(type=FieldType.Keyword)
    private String uuid; // 用户唯一识别码
    @Field(type=FieldType.Text, analyzer = "ik_max_word")
    private String name; //用户名称
    @Field(type=FieldType.Keyword)
    private String avatarUrl; //用户头像url
    @Field(type=FieldType.Integer)
    private int gender; //用户性别 0-女 1-男
    @Field(type=FieldType.Integer)
    private long birthday; //用户生日19940110
    @Field(type=FieldType.Text, analyzer = "ik_max_word")
    private String regional; //所属区域 "中国-广东省-深圳市-南山区"
    @Field(type=FieldType.Keyword)
    private String motto; //座右铭
    @Field(type=FieldType.Text, analyzer = "ik_max_word")
    private String hobbies; //兴趣爱好
}
