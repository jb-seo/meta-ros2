# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "dummy robot bringup"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "  dummy-map-server dummy-sensors launch launch-ros robot-state-publisher ros2run"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/dummy_robot_bringup/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5e6fc768c213cae5adff7f95d4ca8ce4"
SRC_URI[sha256sum] = "30e4072ba6f57663d61f629456bc07c74bd3a9678e9d94d85e7917f09781b468"
S = "${WORKDIR}/demos-release-release-crystal-dummy_robot_bringup-0.6.2-0"

inherit ament
