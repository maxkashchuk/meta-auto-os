SUMMARY = "Auto-OS Image"
DESCRIPTION = "Custom image for Auto-OS image based on tisdk-edgeai-image instance from meta-edgeai layer"
LICENSE = "MIT"

require recipes-core/images/tisdk-edgeai-image.bb

EXCLUDE_PACKAGES += " linux-firmware-iwlwifi-800c linux-firmware-iwlwifi-8265 linux-firmware-iwlwifi-3160-17 linux-firmware-iwlwifi-9260"
IMAGE_INSTALL:remove = " linux-firmware-iwlwifi-800c linux-firmware-iwlwifi-8265 linux-firmware-iwlwifi-3160-17 linux-firmware-iwlwifi-9260"

PACKAGE_INSTALL += " intel-wireless-firmware"
IMAGE_INSTALL:append = " intel-wireless-firmware"

ARAGO_BRAND = "edgeai"
ARAGO_RT_ENABLE = "1"

WKS_FILE = "sk-tda4vm-32gb-partition-table.wks"

IMAGE_BASENAME = "auto-os-${DISTRO_VERSION}-${DATE}"
