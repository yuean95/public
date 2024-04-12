START TRANSACTION;

-- 襯衫銷售價格降低1000
UPDATE shohinins
SET sell_price=sell_price-1000
WHERE shohin_name='襯衫';

-- T恤銷售價格提高1000
UPDATE shohinins
SET sell_price=sell_price+1000
WHERE shohin_name='T恤';

COMMIT;
