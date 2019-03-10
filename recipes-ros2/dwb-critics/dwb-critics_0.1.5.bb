# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The dwb_critics package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake angles costmap-queue dwb-core geometry-msgs nav2-costmap-2d nav2-util nav-2d-msgs nav-2d-utils pluginlib rclcpp sensor-msgs"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/dwb_critics/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "75d8edb17a2e047203137fa3b0afc95a"
SRC_URI[sha256sum] = "5fe73d85c2774d76e668c0ac5c7d9ba255a4933d13fadd9cfcdc1784b73e89c8"
S = "${WORKDIR}/navigation2-release-release-crystal-dwb_critics-0.1.5-0"

inherit catkin
