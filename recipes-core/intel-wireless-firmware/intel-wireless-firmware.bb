SUMMARY = "Intel Wireless Firmware"
DESCRIPTION = "iwlwifi firmware for Intel Wireless cards"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE.i915;md5=2b0b2e0d20984affd4490ba2cba02570"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/firmware/linux-firmware.git;protocol=https;branch=main"
SRCREV = "a19bb447e57a0caa2bcc1ddbda0476c1df2e098a"

FILES:${PN} += "${nonarch_base_libdir}/firmware/*"

PR = "r1"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware

    install -m 0644 ${S}/iwlwifi-*.ucode ${D}${nonarch_base_libdir}/firmware/ || true
    install -m 0644 ${S}/iwlwifi-*.pnvm ${D}${nonarch_base_libdir}/firmware/ || true
}
