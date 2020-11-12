package com.example.dictionary1.word;

import android.net.Uri;
import android.provider.BaseColumns;
import android.support.annotation.NonNull;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Words {

    public static class WordItem {
        public String id;
        public String word;

        public WordItem(String id, String word) {
            this.id = id;
            this.word = word;
        }

        @NonNull
        @Override
        public String toString() {
            return word;
        }
    }

    public static class WordDescription{
        public final String id;
        public final String word;
        public final String meaning;
        public final String sample;

        public WordDescription(String id,String word, String meaning, String sample) {
            this.id = id;
            this.word = word;
            this.meaning = meaning;
            this.sample = sample;
        }
        @NonNull
        @Override
        public String toString() {
            return meaning;
        }
    }

    public Words(){}
    public static final String AUTHORITY = "cn.edu.bistu.cs.se.wordsprovider";

    public static abstract class Word implements BaseColumns {
        public static final String TABLE_NAME = "words";//表名
        //_ID字段：主键
        public static final String COLUMN_NAME_WORD = "word";//字段：单词
        public static final String COLUMN_NAME_MEANING = "meaning";//字段：单词含义
        public static final String COLUMN_NAME_SAMPLE = "sample";//字段：单词示例

        //MIME类型
        public static final String MIME_DIR_PREFIX = "vnd.android.cursor.dir";
        public static final String MIME_ITEM_PREFIX = "vnd.android.cursor.item";
        public static final String MINE_ITEM = "vnd.bistu.cs.se.word";

        public static final String MINE_TYPE_SINGLE = MIME_ITEM_PREFIX + "/" + MINE_ITEM;
        public static final String MINE_TYPE_MULTIPLE = MIME_DIR_PREFIX + "/" + MINE_ITEM;

        public static final String PATH_SINGLE = "word/#";//单条数据的路径
        public static final String PATH_MULTIPLE = "word";//多条数据的路径

        //Content Uri
        public static final String CONTENT_URI_STRING = "content://" + AUTHORITY + "/" + PATH_MULTIPLE;
        public static final Uri CONTENT_URI = Uri.parse(CONTENT_URI_STRING);

    }
}