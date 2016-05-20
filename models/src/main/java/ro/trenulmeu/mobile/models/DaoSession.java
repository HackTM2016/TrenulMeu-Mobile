package ro.trenulmeu.mobile.models;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import ro.trenulmeu.mobile.models.DataBaseStatus;
import ro.trenulmeu.mobile.models.TrainOperator;
import ro.trenulmeu.mobile.models.TrainType;
import ro.trenulmeu.mobile.models.TrainService;
import ro.trenulmeu.mobile.models.TrainPrice;
import ro.trenulmeu.mobile.models.Station;
import ro.trenulmeu.mobile.models.Train;
import ro.trenulmeu.mobile.models.TrainAvailability;
import ro.trenulmeu.mobile.models.TrainPath;

import ro.trenulmeu.mobile.models.DataBaseStatusDao;
import ro.trenulmeu.mobile.models.TrainOperatorDao;
import ro.trenulmeu.mobile.models.TrainTypeDao;
import ro.trenulmeu.mobile.models.TrainServiceDao;
import ro.trenulmeu.mobile.models.TrainPriceDao;
import ro.trenulmeu.mobile.models.StationDao;
import ro.trenulmeu.mobile.models.TrainDao;
import ro.trenulmeu.mobile.models.TrainAvailabilityDao;
import ro.trenulmeu.mobile.models.TrainPathDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig dataBaseStatusDaoConfig;
    private final DaoConfig trainOperatorDaoConfig;
    private final DaoConfig trainTypeDaoConfig;
    private final DaoConfig trainServiceDaoConfig;
    private final DaoConfig trainPriceDaoConfig;
    private final DaoConfig stationDaoConfig;
    private final DaoConfig trainDaoConfig;
    private final DaoConfig trainAvailabilityDaoConfig;
    private final DaoConfig trainPathDaoConfig;

    private final DataBaseStatusDao dataBaseStatusDao;
    private final TrainOperatorDao trainOperatorDao;
    private final TrainTypeDao trainTypeDao;
    private final TrainServiceDao trainServiceDao;
    private final TrainPriceDao trainPriceDao;
    private final StationDao stationDao;
    private final TrainDao trainDao;
    private final TrainAvailabilityDao trainAvailabilityDao;
    private final TrainPathDao trainPathDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        dataBaseStatusDaoConfig = daoConfigMap.get(DataBaseStatusDao.class).clone();
        dataBaseStatusDaoConfig.initIdentityScope(type);

        trainOperatorDaoConfig = daoConfigMap.get(TrainOperatorDao.class).clone();
        trainOperatorDaoConfig.initIdentityScope(type);

        trainTypeDaoConfig = daoConfigMap.get(TrainTypeDao.class).clone();
        trainTypeDaoConfig.initIdentityScope(type);

        trainServiceDaoConfig = daoConfigMap.get(TrainServiceDao.class).clone();
        trainServiceDaoConfig.initIdentityScope(type);

        trainPriceDaoConfig = daoConfigMap.get(TrainPriceDao.class).clone();
        trainPriceDaoConfig.initIdentityScope(type);

        stationDaoConfig = daoConfigMap.get(StationDao.class).clone();
        stationDaoConfig.initIdentityScope(type);

        trainDaoConfig = daoConfigMap.get(TrainDao.class).clone();
        trainDaoConfig.initIdentityScope(type);

        trainAvailabilityDaoConfig = daoConfigMap.get(TrainAvailabilityDao.class).clone();
        trainAvailabilityDaoConfig.initIdentityScope(type);

        trainPathDaoConfig = daoConfigMap.get(TrainPathDao.class).clone();
        trainPathDaoConfig.initIdentityScope(type);

        dataBaseStatusDao = new DataBaseStatusDao(dataBaseStatusDaoConfig, this);
        trainOperatorDao = new TrainOperatorDao(trainOperatorDaoConfig, this);
        trainTypeDao = new TrainTypeDao(trainTypeDaoConfig, this);
        trainServiceDao = new TrainServiceDao(trainServiceDaoConfig, this);
        trainPriceDao = new TrainPriceDao(trainPriceDaoConfig, this);
        stationDao = new StationDao(stationDaoConfig, this);
        trainDao = new TrainDao(trainDaoConfig, this);
        trainAvailabilityDao = new TrainAvailabilityDao(trainAvailabilityDaoConfig, this);
        trainPathDao = new TrainPathDao(trainPathDaoConfig, this);

        registerDao(DataBaseStatus.class, dataBaseStatusDao);
        registerDao(TrainOperator.class, trainOperatorDao);
        registerDao(TrainType.class, trainTypeDao);
        registerDao(TrainService.class, trainServiceDao);
        registerDao(TrainPrice.class, trainPriceDao);
        registerDao(Station.class, stationDao);
        registerDao(Train.class, trainDao);
        registerDao(TrainAvailability.class, trainAvailabilityDao);
        registerDao(TrainPath.class, trainPathDao);
    }
    
    public void clear() {
        dataBaseStatusDaoConfig.getIdentityScope().clear();
        trainOperatorDaoConfig.getIdentityScope().clear();
        trainTypeDaoConfig.getIdentityScope().clear();
        trainServiceDaoConfig.getIdentityScope().clear();
        trainPriceDaoConfig.getIdentityScope().clear();
        stationDaoConfig.getIdentityScope().clear();
        trainDaoConfig.getIdentityScope().clear();
        trainAvailabilityDaoConfig.getIdentityScope().clear();
        trainPathDaoConfig.getIdentityScope().clear();
    }

    public DataBaseStatusDao getDataBaseStatusDao() {
        return dataBaseStatusDao;
    }

    public TrainOperatorDao getTrainOperatorDao() {
        return trainOperatorDao;
    }

    public TrainTypeDao getTrainTypeDao() {
        return trainTypeDao;
    }

    public TrainServiceDao getTrainServiceDao() {
        return trainServiceDao;
    }

    public TrainPriceDao getTrainPriceDao() {
        return trainPriceDao;
    }

    public StationDao getStationDao() {
        return stationDao;
    }

    public TrainDao getTrainDao() {
        return trainDao;
    }

    public TrainAvailabilityDao getTrainAvailabilityDao() {
        return trainAvailabilityDao;
    }

    public TrainPathDao getTrainPathDao() {
        return trainPathDao;
    }

}
