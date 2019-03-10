# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The package provides GoogleMock."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake gtest-vendor"
SRC_URI = "https://github.com/ros2-gbp/googletest-release/archive/release/crystal/gmock_vendor/1.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ad44380a3490746b23e84cb70657e597"
SRC_URI[sha256sum] = "c992c3560bfbf7ea20a1eeb8330b99c796f180e7b9d33bf2ce9d5d2cad429810"
S = "${WORKDIR}/googletest-release-release-crystal-gmock_vendor-1.8.0-0"

inherit catkin
