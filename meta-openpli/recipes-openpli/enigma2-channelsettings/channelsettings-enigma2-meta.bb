SUMMARY = "meta file for settings"

require conf/license/license-gplv2.inc

inherit allarch

PV = "2.0"
PR = "r24"

DEPENDS = " \
    enigma2-plugin-settings-henksat-19e \
    enigma2-plugin-settings-henksat-23e \
    enigma2-plugin-settings-henksat-13e-19e \
    enigma2-plugin-settings-henksat-19e-23e \
    enigma2-plugin-settings-henksat-19e-23e-28e \
    enigma2-plugin-settings-henksat-13e-19e-23e-28e \
    enigma2-plugin-settings-henksat-wavefrontier \
    enigma2-plugin-settings-henksat-rotating \
    enigma2-plugin-settings-henksat-13e-19e-23e-28e-4.8e-0.8w \
    enigma2-plugin-settings-henksat-13e-19e-23e-28e-42e-7e \
    enigma2-plugin-settings-henksat-ziggo \
    enigma2-plugin-settings-hans-19e-23e \
    enigma2-plugin-settings-hans-19e-23e-28e \
    enigma2-plugin-settings-hans-13e-19e-23e-28e \
    enigma2-plugin-settings-hans-13e-19e-23e-28e-rotating \
    \
    enigma2-plugin-settings-cst.dual1.db \
    enigma2-plugin-settings-cst.dual2.db \
    enigma2-plugin-settings-cst.four3.db \
    enigma2-plugin-settings-cst.mono.db \
    enigma2-plugin-settings-cst.motor.db \
    enigma2-plugin-settings-cst.trial3.db \
    enigma2-plugin-settings-cst.trial5.db \
    enigma2-plugin-settings-malimali.3e.7e.9e.13e.16e.19e \
    enigma2-plugin-settings-malimali.9e.13e.19e \
    enigma2-plugin-settings-malimali.13e \
    enigma2-plugin-settings-malimali.13e.19e \
    enigma2-plugin-settings-malimali.13e.16e.19e.28e \
    enigma2-plugin-settings-malimali.19e \
    enigma2-plugin-settings-malimali.39e.28e.23e.19e.16e.13e.0.8w \
    enigma2-plugin-settings-malimali.39e.28e.26e.23e.19e.16e.13e.7e.0.8w \
    enigma2-plugin-settings-malimali.motor.42e.to.30w \
    enigma2-plugin-settings-vhannibal.dual.feeds \
    enigma2-plugin-settings-vhannibal.hotbird \
    enigma2-plugin-settings-vhannibal.motor \
    enigma2-plugin-settings-vhannibal.quad.7e.13e.19e.42e \
    enigma2-plugin-settings-vhannibal.quad.9e.13e.16e.19e \
    enigma2-plugin-settings-vhannibal.quad.13e.19e.23e.28e \
    enigma2-plugin-settings-vhannibal.quad.nordic \
    enigma2-plugin-settings-vhannibal.13e.19e.30w \
    \
    enigma2-plugin-settings-gigablue-19e \
    enigma2-plugin-settings-gigablue-19e-13e \
    enigma2-plugin-settings-gigablue-19e-13e-5e-75e \
    enigma2-plugin-settings-gigablue-19e-16e-13e \
    enigma2-plugin-settings-gigablue-42e-19e-13e-7e \
    enigma2-plugin-settings-gigablue-hepsidijital \
    \
    enigma2-plugin-settings-gigablue-wilhelmtel \
    enigma2-plugin-settings-gigablue-unity-media \
    enigma2-plugin-settings-gigablue-kabel-bw \
    enigma2-plugin-settings-gigablue-kabeldeutschland \
    \
    enigma2-plugin-settings-rytec-13e19e23e28e \
    enigma2-plugin-settings-rytec-motor \
    "
