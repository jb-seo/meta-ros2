# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3D testing framework for RViz."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake ament-cmake-gtest qtbase5-dev rviz-common"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/crystal/rviz_visual_testing_framework/5.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "17ecc75a734be6cb693881c4808288ca"
SRC_URI[sha256sum] = "70d7d6aa110b2f04368e7c7f90d152b6c43f38f704e6188f19352af1e93372c5"
S = "${WORKDIR}/rviz-release-release-crystal-rviz_visual_testing_framework-5.1.0-0"

inherit catkin
