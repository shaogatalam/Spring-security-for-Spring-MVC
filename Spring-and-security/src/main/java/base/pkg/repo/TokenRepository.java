package base.pkg.repo;
import base.pkg.entity.PushNotiPermissionToken;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TokenRepository extends JpaRepository<PushNotiPermissionToken,Long> {
}
