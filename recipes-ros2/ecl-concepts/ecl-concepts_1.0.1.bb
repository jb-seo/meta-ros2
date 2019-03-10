# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Introduces a compile time concept checking mechanism that can be used      most commonly to check for required functionality when passing      template arguments."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-build ecl-config ecl-license ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_concepts/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3318a7a28d15ee7a6ba11c1bef6fcf2c"
SRC_URI[sha256sum] = "2c40dadf1d20d70d7a66e905b174d5159ca3d22bf6a474df5b155ec8e8c809d2"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_concepts-1.0.1-0"

inherit catkin
