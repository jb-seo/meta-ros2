# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "control_msgs contains base messages and actions useful for     controlling robots.  It provides representations for controller     setpoints and joint and cartesian trajectories."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "action-msgs  builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs trajectory-msgs"
SRC_URI = "https://github.com/ros-gbp/control_msgs-release/archive/release/crystal/control_msgs/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fac8eb0b6daa69cdb897550f6d782766"
SRC_URI[sha256sum] = "1d934b64b7a9fbb74be9ce80d1b4f1791c8c40e1128abf787845853e10bd4842"
S = "${WORKDIR}/control_msgs-release-release-crystal-control_msgs-2.1.0-0"

inherit ament pythonpath-insane
