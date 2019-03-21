# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The package provides GoogleMock."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "gtest-vendor cmake"
SRC_URI = "https://github.com/ros2-gbp/googletest-release/archive/release/bouncy/gmock_vendor/1.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4d957ff33cc3fcefe159797e16891b16"
SRC_URI[sha256sum] = "aaaffd0ea6c9203192d8f37daa0316e2c7cd3b3e4146270afc51a7c9c464595d"
S = "${WORKDIR}/googletest-release-release-bouncy-gmock_vendor-1.8.0-0"

inherit ros
inherit cmake


