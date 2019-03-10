# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TODO"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake dwb-msgs geometry-msgs nav2-costmap-2d nav-2d-msgs nav-2d-utils nav-msgs pluginlib rclcpp sensor-msgs std-msgs tf2-ros visualization-msgs"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/dwb_core/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e2150a3f7cb635f939923906912c9153"
SRC_URI[sha256sum] = "998ade93f1f65c201df00793760c524ee4a152ea2925c06cbe01822c54e130d7"
S = "${WORKDIR}/navigation2-release-release-crystal-dwb_core-0.1.5-0"

inherit catkin
