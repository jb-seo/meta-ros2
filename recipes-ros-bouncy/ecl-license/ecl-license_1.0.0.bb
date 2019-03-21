# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Maintains the ecl licenses and also provides an install      target for deploying licenses with the ecl libraries."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=3;endline=3;md5=f895f13378d9b55d775a2405d35506fd"

DEPENDS = ""
SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/bouncy/ecl_license/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4a3cba5d5f196139b7c13f76b1585ed7"
SRC_URI[sha256sum] = "8c7f4f6aabccdfafac836060fd63f5ee55ad7fd8b897487c0bc6eb53474ba547"
S = "${WORKDIR}/ecl_tools-release-release-bouncy-ecl_license-1.0.0-0"

inherit ros
inherit ament


