package ro.trenulmeu.mobile.models;

import ro.trenulmeu.mobile.models.DaoSession;
import de.greenrobot.dao.DaoException;

import ro.trenulmeu.mobile.timespan.TimeSpan;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "TrainPath".
 */
public class TrainPath {

    private Long id;
    private Long TrainId;
    private Float Km;
    private Long StationId;
    private TimeSpan Arrive;
    private TimeSpan Depart;
    private Integer Stationary;
    private Boolean IsStop;
    private Integer Speed;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient TrainPathDao myDao;

    private Train Train;
    private Long Train__resolvedKey;

    private Station Station;
    private Long Station__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public TrainPath() {
    }

    public TrainPath(Long id) {
        this.id = id;
    }

    public TrainPath(Long id, Long TrainId, Float Km, Long StationId, TimeSpan Arrive, TimeSpan Depart, Integer Stationary, Boolean IsStop, Integer Speed) {
        this.id = id;
        this.TrainId = TrainId;
        this.Km = Km;
        this.StationId = StationId;
        this.Arrive = Arrive;
        this.Depart = Depart;
        this.Stationary = Stationary;
        this.IsStop = IsStop;
        this.Speed = Speed;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getTrainPathDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrainId() {
        return TrainId;
    }

    public void setTrainId(Long TrainId) {
        this.TrainId = TrainId;
    }

    public Float getKm() {
        return Km;
    }

    public void setKm(Float Km) {
        this.Km = Km;
    }

    public Long getStationId() {
        return StationId;
    }

    public void setStationId(Long StationId) {
        this.StationId = StationId;
    }

    public TimeSpan getArrive() {
        return Arrive;
    }

    public void setArrive(TimeSpan Arrive) {
        this.Arrive = Arrive;
    }

    public TimeSpan getDepart() {
        return Depart;
    }

    public void setDepart(TimeSpan Depart) {
        this.Depart = Depart;
    }

    public Integer getStationary() {
        return Stationary;
    }

    public void setStationary(Integer Stationary) {
        this.Stationary = Stationary;
    }

    public Boolean getIsStop() {
        return IsStop;
    }

    public void setIsStop(Boolean IsStop) {
        this.IsStop = IsStop;
    }

    public Integer getSpeed() {
        return Speed;
    }

    public void setSpeed(Integer Speed) {
        this.Speed = Speed;
    }

    /** To-one relationship, resolved on first access. */
    public Train getTrain() {
        Long __key = this.TrainId;
        if (Train__resolvedKey == null || !Train__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TrainDao targetDao = daoSession.getTrainDao();
            Train TrainNew = targetDao.load(__key);
            synchronized (this) {
                Train = TrainNew;
            	Train__resolvedKey = __key;
            }
        }
        return Train;
    }

    public void setTrain(Train Train) {
        synchronized (this) {
            this.Train = Train;
            TrainId = Train == null ? null : Train.getId();
            Train__resolvedKey = TrainId;
        }
    }

    /** To-one relationship, resolved on first access. */
    public Station getStation() {
        Long __key = this.StationId;
        if (Station__resolvedKey == null || !Station__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            StationDao targetDao = daoSession.getStationDao();
            Station StationNew = targetDao.load(__key);
            synchronized (this) {
                Station = StationNew;
            	Station__resolvedKey = __key;
            }
        }
        return Station;
    }

    public void setStation(Station Station) {
        synchronized (this) {
            this.Station = Station;
            StationId = Station == null ? null : Station.getId();
            Station__resolvedKey = StationId;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}