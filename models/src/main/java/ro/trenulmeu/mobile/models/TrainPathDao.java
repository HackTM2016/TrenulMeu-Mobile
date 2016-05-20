package ro.trenulmeu.mobile.models;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;

import ro.trenulmeu.mobile.timespan.TimeSpan;
import ro.trenulmeu.mobile.timespan.TimeSpanAdapter;

import ro.trenulmeu.mobile.models.TrainPath;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TrainPath".
*/
public class TrainPathDao extends AbstractDao<TrainPath, Long> {

    public static final String TABLENAME = "TrainPath";

    /**
     * Properties of entity TrainPath.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "Id");
        public final static Property TrainId = new Property(1, Long.class, "TrainId", false, "TrainId");
        public final static Property Km = new Property(2, Float.class, "Km", false, "Km");
        public final static Property StationId = new Property(3, Long.class, "StationId", false, "StationId");
        public final static Property Arrive = new Property(4, Short.class, "Arrive", false, "Arrive");
        public final static Property Depart = new Property(5, Short.class, "Depart", false, "Depart");
        public final static Property Stationary = new Property(6, Integer.class, "Stationary", false, "Stationary");
        public final static Property IsStop = new Property(7, Boolean.class, "IsStop", false, "IsStop");
        public final static Property Speed = new Property(8, Integer.class, "Speed", false, "Speed");
    };

    private DaoSession daoSession;

    private final TimeSpanAdapter ArriveConverter = new TimeSpanAdapter();
    private final TimeSpanAdapter DepartConverter = new TimeSpanAdapter();
    private Query<TrainPath> train_PathQuery;

    public TrainPathDao(DaoConfig config) {
        super(config);
    }
    
    public TrainPathDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TrainPath\" (" + //
                "\"Id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TrainId\" INTEGER," + // 1: TrainId
                "\"Km\" REAL," + // 2: Km
                "\"StationId\" INTEGER," + // 3: StationId
                "\"Arrive\" INTEGER," + // 4: Arrive
                "\"Depart\" INTEGER," + // 5: Depart
                "\"Stationary\" INTEGER," + // 6: Stationary
                "\"IsStop\" INTEGER," + // 7: IsStop
                "\"Speed\" INTEGER);"); // 8: Speed
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TrainPath\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, TrainPath entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long TrainId = entity.getTrainId();
        if (TrainId != null) {
            stmt.bindLong(2, TrainId);
        }
 
        Float Km = entity.getKm();
        if (Km != null) {
            stmt.bindDouble(3, Km);
        }
 
        Long StationId = entity.getStationId();
        if (StationId != null) {
            stmt.bindLong(4, StationId);
        }
 
        TimeSpan Arrive = entity.getArrive();
        if (Arrive != null) {
            stmt.bindLong(5, ArriveConverter.convertToDatabaseValue(Arrive));
        }
 
        TimeSpan Depart = entity.getDepart();
        if (Depart != null) {
            stmt.bindLong(6, DepartConverter.convertToDatabaseValue(Depart));
        }
 
        Integer Stationary = entity.getStationary();
        if (Stationary != null) {
            stmt.bindLong(7, Stationary);
        }
 
        Boolean IsStop = entity.getIsStop();
        if (IsStop != null) {
            stmt.bindLong(8, IsStop ? 1L: 0L);
        }
 
        Integer Speed = entity.getSpeed();
        if (Speed != null) {
            stmt.bindLong(9, Speed);
        }
    }

    @Override
    protected void attachEntity(TrainPath entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public TrainPath readEntity(Cursor cursor, int offset) {
        TrainPath entity = new TrainPath( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // TrainId
            cursor.isNull(offset + 2) ? null : cursor.getFloat(offset + 2), // Km
            cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3), // StationId
            cursor.isNull(offset + 4) ? null : ArriveConverter.convertToEntityProperty(cursor.getShort(offset + 4)), // Arrive
            cursor.isNull(offset + 5) ? null : DepartConverter.convertToEntityProperty(cursor.getShort(offset + 5)), // Depart
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // Stationary
            cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0, // IsStop
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8) // Speed
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, TrainPath entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTrainId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setKm(cursor.isNull(offset + 2) ? null : cursor.getFloat(offset + 2));
        entity.setStationId(cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3));
        entity.setArrive(cursor.isNull(offset + 4) ? null : ArriveConverter.convertToEntityProperty(cursor.getShort(offset + 4)));
        entity.setDepart(cursor.isNull(offset + 5) ? null : DepartConverter.convertToEntityProperty(cursor.getShort(offset + 5)));
        entity.setStationary(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setIsStop(cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0);
        entity.setSpeed(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(TrainPath entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(TrainPath entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "Path" to-many relationship of Train. */
    public List<TrainPath> _queryTrain_Path(Long TrainId) {
        synchronized (this) {
            if (train_PathQuery == null) {
                QueryBuilder<TrainPath> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.TrainId.eq(null));
                queryBuilder.orderRaw("T.'Km' ASC");
                train_PathQuery = queryBuilder.build();
            }
        }
        Query<TrainPath> query = train_PathQuery.forCurrentThread();
        query.setParameter(0, TrainId);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getTrainDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getStationDao().getAllColumns());
            builder.append(" FROM TrainPath T");
            builder.append(" LEFT JOIN Train T0 ON T.\"TrainId\"=T0.\"Id\"");
            builder.append(" LEFT JOIN Station T1 ON T.\"StationId\"=T1.\"Id\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected TrainPath loadCurrentDeep(Cursor cursor, boolean lock) {
        TrainPath entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Train Train = loadCurrentOther(daoSession.getTrainDao(), cursor, offset);
        entity.setTrain(Train);
        offset += daoSession.getTrainDao().getAllColumns().length;

        Station Station = loadCurrentOther(daoSession.getStationDao(), cursor, offset);
        entity.setStation(Station);

        return entity;    
    }

    public TrainPath loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<TrainPath> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<TrainPath> list = new ArrayList<TrainPath>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<TrainPath> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<TrainPath> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}