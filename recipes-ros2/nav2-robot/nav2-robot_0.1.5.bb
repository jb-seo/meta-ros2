# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TODO"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake geometry-msgs nav-msgs rclcpp urdf"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_robot/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "37e94c94ab3ce4f5d10ff555219b0655"
SRC_URI[sha256sum] = "fe235a9447debbc7d5e1fe92e5b5647ba02bc04212a5ac20d90b1a6f28d7a090"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_robot-0.1.5-0"

inherit catkin
