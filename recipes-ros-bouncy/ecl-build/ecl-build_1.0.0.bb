# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Collection of cmake/make build tools primarily for ecl development itself, but also      contains a few cmake modules useful outside of the ecl."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/bouncy/ecl_build/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "96eadc2c139c7362c410f8004f0f73e8"
SRC_URI[sha256sum] = "2886b60936126432972fbfe4a93583c25fb7cbf12ac27a2082609e6e4bad4789"
S = "${WORKDIR}/ecl_tools-release-release-bouncy-ecl_build-1.0.0-0"


inherit ros
inherit ament

