# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Maintains the ecl licenses and also provides an install      target for deploying licenses with the ecl libraries."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=3;endline=3;md5=f895f13378d9b55d775a2405d35506fd"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/crystal/ecl_license/1.0.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "645d2f4743cea4dc4891945211bcbe46"
SRC_URI[sha256sum] = "3a142f1a9e1aa1229979e45856ab06c6c923a9efd595dd616d2f04b2f5fbc721"
S = "${WORKDIR}/ecl_tools-release-release-crystal-ecl_license-1.0.1-1"

inherit catkin
