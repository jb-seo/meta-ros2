# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a set of simple math utilities to work         with angles. The utilities cover simple things like         normalizing an angle and conversion between degrees and         radians. But even if you're trying to calculate things like         the shortest angular distance between two joint space         positions of your robot, but the joint motion is constrained         by joint limits, this package is what you need. The code in         this package is stable and well tested. There are no plans for         major changes in the near future."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/1.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eb61f40709c3e2ef48bb5bb6fa87cda8"
SRC_URI[sha256sum] = "e203ac9e43ab4dc1c9ac8537e84e4251c254e9fd3533b91d262fac68dc9aeb1a"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-1.12.0-0"

inherit catkin
