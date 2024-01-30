package omnivore.bookmark.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import omnivore.bookmark.dto.BookmarkInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@DynamoDBTable(tableName = "restaurant")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Restaurant {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String  id;

    @DynamoDBAttribute
    private String photo;

    @DynamoDBAttribute
    private String name;

    @DynamoDBAttribute
    private String category;

    @DynamoDBAttribute
    private String coodinate;

    @DynamoDBAttribute
    private List<Map<String, String>> operation = new ArrayList<>();

    public BookmarkInfo toDto() {
        return BookmarkInfo.builder()
                .id(id)
                .name(name)
                .photo(photo)
                .category(category)
                .build();
    }
}
