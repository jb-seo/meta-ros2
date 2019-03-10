# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS2 Navigation Stack"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake nav2-amcl nav2-bt-navigator nav2-costmap-2d nav2-dwb-controller nav2-dynamic-params nav2-map-server nav2-mission-executor nav2-motion-primitives nav2-msgs nav2-navfn-planner nav2-robot nav2-simple-navigator nav2-tasks nav2-util nav2-voxel-grid nav2-world-model"
SRC_URI = "https://github.com/SteveMacenski/${PN}-release/archive/release/crystal/${PN}/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bd4c71d6e8db56a46c0f00ca09c16884"
SRC_URI[sha256sum] = "eac0e6d7a2feff398cc5925eda1f83d9ffbfac2abd500622cafd104e365d15a8"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-0.1.5-0"

inherit catkin
