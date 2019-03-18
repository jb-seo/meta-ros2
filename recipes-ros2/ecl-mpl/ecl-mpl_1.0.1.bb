# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metaprogramming tools move alot of runtime calculations to be shifted to     compile time. This has only very elementary structures at this stage."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_mpl/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7b0d23d53698ec9ac5fdd6274db6058e"
SRC_URI[sha256sum] = "b4200f6806db576ae61d0e4eddfb60286f0c8a9f4523abccbb72ae284cdd6f73"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_mpl-1.0.1-0"

inherit ament
