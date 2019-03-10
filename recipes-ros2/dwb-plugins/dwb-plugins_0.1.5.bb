# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Standard implementations of the GoalChecker       and TrajectoryGenerators for dwb_core"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake angles dwb-core nav2-dynamic-params nav2-util nav-2d-msgs nav-2d-utils pluginlib rclcpp"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/dwb_plugins/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "718dfe267c560cf3b9e451eaa6c4029b"
SRC_URI[sha256sum] = "c963429a8572e8f82b997a3584e35ce65b254804b4e23982e55b6cfdc48b860c"
S = "${WORKDIR}/navigation2-release-release-crystal-dwb_plugins-0.1.5-0"

inherit catkin
