package com.tian.repository;

import com.tian.entity.Scenic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ScenicRepository extends CrudRepository<Scenic, Long> {
    @Query("select t from Scenic t where t.webSite=:webSite and t.city=:city")
    Page<Scenic> getScenic(@Param("webSite") String webSite, @Param("city") String city, Pageable pageable);

    @Query("select t from Scenic t where t.city=:city")
    Page<Scenic> getScenicAll(@Param("city") String city, Pageable pageable);

    @Query("select t from Scenic t where t.webSite=:webSite and t.city=:city")
    List<Scenic> getByWebSiteAndCity(@Param("webSite") String webSite, @Param("city") String city);

    List<Scenic> findByCity(@Param("webSite") String webSite);

    Scenic findByName(String name);
}