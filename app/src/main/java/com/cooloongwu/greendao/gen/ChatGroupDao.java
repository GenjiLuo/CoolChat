package com.cooloongwu.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.cooloongwu.coolchat.entity.ChatGroup;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "CHAT_GROUP".
 */
public class ChatGroupDao extends AbstractDao<ChatGroup, Long> {

    public static final String TABLENAME = "CHAT_GROUP";

    /**
     * Properties of entity ChatGroup.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UserId = new Property(1, long.class, "userId", false, "USER_ID");
        public final static Property ToGroupId = new Property(2, long.class, "toGroupId", false, "TO_GROUP_ID");
        public final static Property UserName = new Property(3, String.class, "userName", false, "USER_NAME");
        public final static Property UserAvatar = new Property(4, String.class, "userAvatar", false, "USER_AVATAR");
        public final static Property Content = new Property(5, String.class, "content", false, "CONTENT");
        public final static Property ContentType = new Property(6, String.class, "contentType", false, "CONTENT_TYPE");
        public final static Property Time = new Property(7, String.class, "time", false, "TIME");
    }


    public ChatGroupDao(DaoConfig config) {
        super(config);
    }

    public ChatGroupDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "\"CHAT_GROUP\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"USER_ID\" INTEGER NOT NULL ," + // 1: userId
                "\"TO_GROUP_ID\" INTEGER NOT NULL ," + // 2: toGroupId
                "\"USER_NAME\" TEXT," + // 3: userName
                "\"USER_AVATAR\" TEXT," + // 4: userAvatar
                "\"CONTENT\" TEXT," + // 5: content
                "\"CONTENT_TYPE\" TEXT," + // 6: contentType
                "\"TIME\" TEXT);"); // 7: time
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CHAT_GROUP\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ChatGroup entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getUserId());
        stmt.bindLong(3, entity.getToGroupId());

        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(4, userName);
        }

        String userAvatar = entity.getUserAvatar();
        if (userAvatar != null) {
            stmt.bindString(5, userAvatar);
        }

        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(6, content);
        }

        String contentType = entity.getContentType();
        if (contentType != null) {
            stmt.bindString(7, contentType);
        }

        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(8, time);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ChatGroup entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getUserId());
        stmt.bindLong(3, entity.getToGroupId());

        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(4, userName);
        }

        String userAvatar = entity.getUserAvatar();
        if (userAvatar != null) {
            stmt.bindString(5, userAvatar);
        }

        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(6, content);
        }

        String contentType = entity.getContentType();
        if (contentType != null) {
            stmt.bindString(7, contentType);
        }

        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(8, time);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    @Override
    public ChatGroup readEntity(Cursor cursor, int offset) {
        ChatGroup entity = new ChatGroup( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.getLong(offset + 1), // userId
                cursor.getLong(offset + 2), // toGroupId
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // userName
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // userAvatar
                cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // content
                cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // contentType
                cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // time
        );
        return entity;
    }

    @Override
    public void readEntity(Cursor cursor, ChatGroup entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserId(cursor.getLong(offset + 1));
        entity.setToGroupId(cursor.getLong(offset + 2));
        entity.setUserName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUserAvatar(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setContent(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setContentType(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setTime(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
    }

    @Override
    protected final Long updateKeyAfterInsert(ChatGroup entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    @Override
    public Long getKey(ChatGroup entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ChatGroup entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }

}
